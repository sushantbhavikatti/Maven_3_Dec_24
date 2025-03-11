package Parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {


    @DataProvider(name = "test data")
    public Object[][] dataProviderFun() throws IOException {
       Object[][] arrObj = getExcelData("C:\\Users\\de\\Documents\\Book1.xlsx","Sheet1");
        return arrObj;
    }

    public String [][] getExcelData(String filePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet(sheetName);
        XSSFRow row = sheet.getRow(0);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfColumn = sheet.getLastRowNum();

        Cell cell;

        String[][] data = new String[noOfRows - 1][noOfColumn];

        for(int i=1; i<noOfRows; i++) {
            for (int j=0; j < noOfColumn; j++){
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i-1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }

    @Test(dataProvider = "test data")
    public void searchOfMultipleCities(String courseName, String cityName) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.in/");
        driver.manage().window().maximize();
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("Java" + " " + "Mumbai");
        searchTextBox.sendKeys(Keys.ENTER);
        driver.close();
    }
}