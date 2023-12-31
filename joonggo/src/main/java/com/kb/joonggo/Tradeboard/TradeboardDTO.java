package com.kb.joonggo.Tradeboard;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TradeboardDTO {
    private int tb_idx;
    private String tb_title;
    private String tb_content;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date tb_date;
    private int tb_price;
    private String tb_category;
    private int tb_count;
    private String tb_state;
    private int mbr_idx;
    private int img_idx;
}
