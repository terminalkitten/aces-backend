package example.ark_smartbridge_listener.eth_bridge;

import lombok.Data;

@Data
public class EthTransactionMessageView {

    private String token;
    private String createdAt;
    private String status;
    private String serviceArkAddress;
    private String requiredArkAmount;
    private String returnArkAddress;
    private String recipientEthAddress;
    private String ethAmount;
}
