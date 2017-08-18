package example.ark_smartbridge_listener.eth_transfer;

import lombok.Data;

@Data
public class EthTransferContractView {

    private String token;
    private String createdAt;
    private String status;
    private String serviceArkAddress;
    private String requiredArkAmount;
    private String returnArkAddress;
    private String returnArkAmount;
    private String recipientEthAddress;
    private String arkPerEthExchangeRate;
    private String ethAmount;
    private String ethTransactionHash;
}
