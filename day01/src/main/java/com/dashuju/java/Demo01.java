package com.dashuju.java;

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;

import static java.util.Arrays.asList;

public class Demo01 {
    public static void main(String[] args) {
        SparkConf sparkConf = new SparkConf();
        SparkContext sparkContext = new SparkContext(sparkConf);
    }
}
