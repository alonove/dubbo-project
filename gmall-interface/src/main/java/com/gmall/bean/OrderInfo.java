package com.gmall.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfo implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;

	private String userName;

	private String shopName;

	private Double price = 2D;

	private String version;

}
