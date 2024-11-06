package org.koreait.exam01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ex01 {

    private Connection conn;

    @BeforeAll // 최초 한번만 수행 static으로 정의
    static void setup() throws Exception { // 예외처리
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }

    @BeforeEach
    void init() throws Exception {
        // JDBC - Java Database Connectivity
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        conn = DriverManager.getConnection(url, "spring6", "oracle");
    }

    @Test
    void test1() {
        System.out.println(conn);
    }

    @AfterEach
    void close() throws Exception {
        conn.close();
    }

}
