package ru.market_gb.core.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema(description = "Модель элемента корзины")
public class CartItemDto {
    @Schema(description = "Идентификатор элемента корзины", required = true, example = "1")
    private Long productId;
    @Schema(description = "Название товара", required = true, example = "Товар№1")
    private String productTitle;
    @Schema(description = "Количество товаров", required = true, example = "3")
    private int quantity;
    @Schema(description = "Цена за еденицу", required = true, example = "500.00")
    private BigDecimal pricePerProduct;
    @Schema(description = "Стоимость элемента корзины", required = true, example = "1500.00")
    private BigDecimal price;
}
