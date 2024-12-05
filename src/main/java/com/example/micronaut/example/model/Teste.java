package com.example.micronaut.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.serde.annotation.Serdeable;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@lombok.Getter
@lombok.Setter
@Serdeable
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString
@lombok.EqualsAndHashCode

@Schema(name = "Teste")
public class Teste {
    @Schema(title = "", example = "[\"Any Example\"]")
    @ArraySchema(schema = @Schema(name = "array", example = "[\"Any Example\"]", implementation = List.class, requiredMode = Schema.RequiredMode.NOT_REQUIRED))
    @lombok.Builder.Default
    private List<String> array = new ArrayList<>();


    @Schema(title = "", example = "[\"Any Example\",\"Other Example\"]")
    @ArraySchema(schema = @Schema(name = "array2", example = "[\"Any Example\",\"Other Example\"]", implementation = List.class, requiredMode = Schema.RequiredMode.NOT_REQUIRED))
    @NotNull
    private List<String> array2 = new ArrayList<>();


    @Schema(title = "")
    @ArraySchema(schema = @Schema(name = "array3", implementation = LastRetryRecurringPaymentIds.class, requiredMode = Schema.RequiredMode.NOT_REQUIRED))
    @lombok.Builder.Default
    private List<LastRetryRecurringPaymentIds> array3 = new ArrayList<>();
}
