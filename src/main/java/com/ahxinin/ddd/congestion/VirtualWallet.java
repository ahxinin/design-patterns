package com.ahxinin.ddd.congestion;

import java.math.BigDecimal;

/**
 * @description: 虚拟钱包
 * @date : 2023-02-25
 */
public class VirtualWallet {

    private Long id;
    private BigDecimal balance = BigDecimal.ZERO;
    private BigDecimal forzenAmount = BigDecimal.ZERO;

    public VirtualWallet(Long id){
        this.id = id;
    }

    public void freeze(BigDecimal amount){}

    public void unFreeze(BigDecimal amount){}

    public BigDecimal balance(){
        return this.balance;
    }

    public BigDecimal getAvailableBalance(){
        return this.balance.subtract(this.forzenAmount);
    }
}
