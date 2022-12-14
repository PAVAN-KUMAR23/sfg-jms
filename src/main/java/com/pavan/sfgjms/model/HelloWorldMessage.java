package com.pavan.sfgjms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;
//POJO means Plain old java object model
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HelloWorldMessage implements Serializable {
    static final long serialVersionUID = -6703826490277916847L;
    private UUID id;
    private String message;
}
