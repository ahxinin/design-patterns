package com.ahxinin.ddd.anemic;

import java.math.BigDecimal;

/**
 * @description: 虚拟钱包服务
 * @date : 2023-02-25
 */
public class VirtualWalletService {

    public VirtualWalletBo getVirtualWallet(Long walletId) {
        return null;
    }

    public BigDecimal getBalance(Long walletId) {
        return BigDecimal.ZERO;
    }

    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {

    }
}
