package org.koreait.order.controllers;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class RequestOrder {

    @DateTimeFormat(pattern="yyyy/MM/dd")
    private LocalDate sDate; // 시작일자

    @DateTimeFormat(pattern="yyyy/MM/dd")
    private LocalDate eDate; // 종료일자
}
