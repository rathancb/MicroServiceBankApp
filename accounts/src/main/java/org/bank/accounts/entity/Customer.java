package org.bank.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.bank.accounts.AccountsApplication;


@Entity
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor
public class Customer extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerID;

	private String name;

	private String email;

	//Both are same mobileNumber = mobile_number not required to mention, just like customer_id
	@Column(name = "mobile_number")
	private String mobileNumber;
}
