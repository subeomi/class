package org.example.main;

import org.example.assembler.Assembler;
import org.example.domain.RegisterRequest;
import org.example.service.ChangePasswordService;
import org.example.service.MemberRegisterService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class MemberManagerMain2 {

    // 조립기 : 객체를 관리
    static GenericXmlApplicationContext ctx =
            new GenericXmlApplicationContext("classpath:appCtx.xml");


    public static void main(String[] args) {
        // 객체 비교 -> 참조값 비교

        MemberRegisterService service1 =
                ctx.getBean("memberRegisterService", MemberRegisterService.class);

        MemberRegisterService service2 =
                ctx.getBean("memberRegisterService", MemberRegisterService.class);

        System.out.println("service1 == service2 : " + (service1 == service2));

    }



}
