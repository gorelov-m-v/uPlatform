package model.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Entity
@Table(name="account")
@Getter @Setter
public class Account {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "external_id_value")
    private String externalAccountId;

    @Column(name = "password_value")
    private String passwordValue;

    @Column(name = "password_valid_to")
    private String passwordValidTo;

    @Column(name = "account_id_value")
    private String  accountIdValue;

    @Column(name = "currency_value")
    private String currency;

    @Column(name = "registration_registration_date")
    private Date registrationDate;

    @Column(name = "registration_registration_ip")
    private String registrationIp;

    @Column(name = "password_changed_at")
    private String passwordChangedAt;

    @Column(name = "password_reset_at")
    private String passwordResetAt;

    @Column(name = "status_value")
    private String statusValue;

    @Column(name = "node_id")
    private String nodeId;

    @Column(name = "node_group_id")
    private String nodeGroupId;

    @Column(name = "auth_secret")
    private String authSecret;

    @Column(name = "disable2fa_code")
    private String disable2faCode;


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", externalAccountId='" + externalAccountId + '\'' +
                ", passwordValue='" + passwordValue + '\'' +
                ", passwordValidTo='" + passwordValidTo + '\'' +
                ", accountIdValue='" + accountIdValue + '\'' +
                ", currency='" + currency + '\'' +
                ", registrationDate=" + registrationDate +
                ", registrationIp='" + registrationIp + '\'' +
                ", passwordChangedAt='" + passwordChangedAt + '\'' +
                ", passwordResetAt='" + passwordResetAt + '\'' +
                ", statusValue='" + statusValue + '\'' +
                ", nodeId='" + nodeId + '\'' +
                ", nodeGroupId='" + nodeGroupId + '\'' +
                ", authSecret='" + authSecret + '\'' +
                ", disable2faCode='" + disable2faCode + '\'' +
                '}';
    }
}
