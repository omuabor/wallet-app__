package com.wallettapp.transfer.serviceimplementation;

import com.wallettapp.transfer.service.Transfer;

public class TransferImpl implements Transfer {

    public String transferMoney(String sender, String receiver) {
        String narration = String.format("Money has been transferred from %s to %s", sender, receiver);
        return narration;
    }
}
