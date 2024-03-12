package org.example.app.data;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemDto {
    private long id;
    private String name;
    private long price;
}
