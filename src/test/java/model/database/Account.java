package model.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="account")
@Getter @Setter
public class Account {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "account_id_value")
    private String  accountIdValue;
}
