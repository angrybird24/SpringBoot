package com.shop.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class CartItemDto {

    @NotNull(message = "상품 아이디 필수임")
    private Long itemId;

    @Min(value = 1, message = "최소 1개 이상 담아요!")
    private int count;


}
