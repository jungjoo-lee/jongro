package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(20000, 30000);
        } catch (PriceNegativeException e) {
            throw new RuntimeException(e);
        } catch (MoneyNegativeException e) {
            throw new RuntimeException(e);
        } catch (NotEnoughMoneyException e) {
            throw new RuntimeException(e);
        }
    }
}
