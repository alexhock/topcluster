package com.codertools.AlCluster;

import org.apache.commons.csv.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
            Load();
        } catch(Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Finished");
    }


    public static void Load() throws FileNotFoundException, IOException
    {
        Reader in = new FileReader("d:/normalized_samples.csv");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        for (CSVRecord record : records) {
            String col1string = record.get(0);
            String col2string = record.get(1);
            double col1 = Double.parseDouble(col1string);
            double col2 = Double.parseDouble(col2string);
            double d = col1+col2;
        }
        in.close();

    }
}
