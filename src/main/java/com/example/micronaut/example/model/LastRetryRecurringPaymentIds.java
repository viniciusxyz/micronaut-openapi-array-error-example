package com.example.micronaut.example.model;

import io.micronaut.serde.annotation.Serdeable;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;

@lombok.Getter
@lombok.Setter
@Serdeable
@lombok.NoArgsConstructor

@ArraySchema(schema = @Schema(name = "LastRetryRecurringPaymentIds", example = "[\"any example\"]"))
@Schema(name = "LastRetryRecurringPaymentIds", example = "[\"any example\"]")
public class LastRetryRecurringPaymentIds extends ArrayList<String> {
}
