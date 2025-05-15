package com.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.FileReader;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EmployeeTimeCalculator {

    public static void main(String[] args) {
        try {
            String csvFile = "EmployeeDataExcel.csv";
            String datePattern = "yyyy-MM-dd HH:mm:ss";
            
            List<EmployeeRecord> records = new CsvTimeReader()
                .readRecords(csvFile, datePattern);
            
            records.forEach(record -> {
                System.out.println("Employee #: " + record.employeeId());
                System.out.println("Clock In:   " + record.clockIn());
                System.out.println("Clock Out:  " + record.clockOut());
                System.out.println("Hours Worked: " + record.hoursWorked());
                System.out.println("----------------------");
            });
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private record EmployeeRecord(
        String employeeId,
        LocalDateTime clockIn,
        LocalDateTime clockOut,
        double hoursWorked
    ) {}

    private static class CsvTimeReader {
        public List<EmployeeRecord> readRecords(String filePath, String datePattern) throws Exception {
            List<EmployeeRecord> results = new ArrayList<>();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datePattern);

            try (FileReader reader = new FileReader(filePath);
                 CSVParser parser = CSVFormat.DEFAULT
                     .withHeader("EmployeeID", "ClockIn", "ClockOut") // Update headers to match CSV
                     .withFirstRecordAsHeader()
                     .parse(reader)) {

                for (CSVRecord record : parser) {
                    String empId = record.get("EmployeeID");
                    LocalDateTime in = LocalDateTime.parse(record.get("ClockIn"), formatter);
                    LocalDateTime out = LocalDateTime.parse(record.get("ClockOut"), formatter);
                    
                    double hours = Duration.between(in, out).toMinutes() / 60.0;
                    results.add(new EmployeeRecord(empId, in, out, hours));
                }
            }
            return results;
        }
    }
}
