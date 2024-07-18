/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.springframework.samples.petclinic.rest.api;

import org.springframework.samples.petclinic.rest.dto.OwnerDto;
import org.springframework.samples.petclinic.rest.dto.OwnerFieldsDto;
import org.springframework.samples.petclinic.rest.dto.PetDto;
import org.springframework.samples.petclinic.rest.dto.PetFieldsDto;
import org.springframework.samples.petclinic.rest.dto.RestErrorDto;
import org.springframework.samples.petclinic.rest.dto.VisitDto;
import org.springframework.samples.petclinic.rest.dto.VisitFieldsDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-17T11:33:50.417503400+05:30[Asia/Calcutta]")
@Validated
@Tag(name = "owners", description = "Endpoints related to pet owners.")
public interface OwnersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /owners : Adds a pet owner
     * Records the details of a new pet owner.
     *
     * @param ownerFieldsDto The pet owner (required)
     * @return The pet owner was sucessfully added. (status code 201)
     *         or Bad request. (status code 400)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "addOwner",
        summary = "Adds a pet owner",
        description = "Records the details of a new pet owner.",
        tags = { "owner" },
        responses = {
            @ApiResponse(responseCode = "201", description = "The pet owner was sucessfully added.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OwnerDto.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/owners",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<OwnerDto> addOwner(
        @Parameter(name = "OwnerFieldsDto", description = "The pet owner", required = true) @Valid @RequestBody OwnerFieldsDto ownerFieldsDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /owners/{ownerId}/pets : Adds a pet to an owner
     * Records the details of a new pet.
     *
     * @param ownerId The ID of the pet owner. (required)
     * @param petFieldsDto The details of the new pet. (required)
     * @return The pet was sucessfully added. (status code 201)
     *         or Bad request. (status code 400)
     *         or Pet not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "addPetToOwner",
        summary = "Adds a pet to an owner",
        description = "Records the details of a new pet.",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "201", description = "The pet was sucessfully added.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PetDto.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Pet not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/owners/{ownerId}/pets",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PetDto> addPetToOwner(
        @Min(0) @Parameter(name = "ownerId", description = "The ID of the pet owner.", required = true, in = ParameterIn.PATH) @PathVariable("ownerId") Integer ownerId,
        @Parameter(name = "PetFieldsDto", description = "The details of the new pet.", required = true) @Valid @RequestBody PetFieldsDto petFieldsDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /owners/{ownerId}/pets/{petId}/visits : Adds a vet visit
     * Records the details of a new vet visit.
     *
     * @param ownerId The ID of the pet owner. (required)
     * @param petId The ID of the pet. (required)
     * @param visitFieldsDto The details of the new vet visit. (required)
     * @return The vet visit was sucessfully added. (status code 201)
     *         or Bad request. (status code 400)
     *         or Pet not found for this owner. (status code 404)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "addVisitToOwner",
        summary = "Adds a vet visit",
        description = "Records the details of a new vet visit.",
        tags = { "visit" },
        responses = {
            @ApiResponse(responseCode = "201", description = "The vet visit was sucessfully added.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = VisitDto.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Pet not found for this owner.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/owners/{ownerId}/pets/{petId}/visits",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<VisitDto> addVisitToOwner(
        @Min(0) @Parameter(name = "ownerId", description = "The ID of the pet owner.", required = true, in = ParameterIn.PATH) @PathVariable("ownerId") Integer ownerId,
        @Min(0) @Parameter(name = "petId", description = "The ID of the pet.", required = true, in = ParameterIn.PATH) @PathVariable("petId") Integer petId,
        @Parameter(name = "VisitFieldsDto", description = "The details of the new vet visit.", required = true) @Valid @RequestBody VisitFieldsDto visitFieldsDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /owners/{ownerId} : Delete an owner by ID
     * Returns the owner or a 404 error.
     *
     * @param ownerId The ID of the owner. (required)
     * @return Owner details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Owner  not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "deleteOwner",
        summary = "Delete an owner by ID",
        description = "Returns the owner or a 404 error.",
        tags = { "owner" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Owner details found and returned.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OwnerDto.class))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Owner  not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/owners/{ownerId}",
        produces = { "application/json" }
    )
    default ResponseEntity<OwnerDto> deleteOwner(
        @Min(0) @Parameter(name = "ownerId", description = "The ID of the owner.", required = true, in = ParameterIn.PATH) @PathVariable("ownerId") Integer ownerId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /owners/{ownerId} : Get a pet owner by ID
     * Returns the pet owner or a 404 error.
     *
     * @param ownerId The ID of the pet owner. (required)
     * @return Owner details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Owner not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "getOwner",
        summary = "Get a pet owner by ID",
        description = "Returns the pet owner or a 404 error.",
        tags = { "owner" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Owner details found and returned.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OwnerDto.class))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Owner not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/owners/{ownerId}",
        produces = { "application/json" }
    )
    default ResponseEntity<OwnerDto> getOwner(
        @Min(0) @Parameter(name = "ownerId", description = "The ID of the pet owner.", required = true, in = ParameterIn.PATH) @PathVariable("ownerId") Integer ownerId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /owners/{ownerId}/pets/{petId} : Get a pet by ID
     * Returns the pet or a 404 error.
     *
     * @param ownerId The ID of the pet owner. (required)
     * @param petId The ID of the pet. (required)
     * @return Pet details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Pet not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "getOwnersPet",
        summary = "Get a pet by ID",
        description = "Returns the pet or a 404 error.",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Pet details found and returned.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PetDto.class))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Pet not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/owners/{ownerId}/pets/{petId}",
        produces = { "application/json" }
    )
    default ResponseEntity<PetDto> getOwnersPet(
        @Min(0) @Parameter(name = "ownerId", description = "The ID of the pet owner.", required = true, in = ParameterIn.PATH) @PathVariable("ownerId") Integer ownerId,
        @Min(0) @Parameter(name = "petId", description = "The ID of the pet.", required = true, in = ParameterIn.PATH) @PathVariable("petId") Integer petId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /owners : Lists pet owners
     * Returns an array of pet owners.
     *
     * @param lastName Last name. (optional)
     * @return Owner details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "listOwners",
        summary = "Lists pet owners",
        description = "Returns an array of pet owners.",
        tags = { "owner" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Owner details found and returned.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = OwnerDto.class)))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/owners",
        produces = { "application/json" }
    )
    default ResponseEntity<List<OwnerDto>> listOwners(
        @Parameter(name = "lastName", description = "Last name.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "lastName", required = false) String lastName
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ null, null ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /owners/{ownerId} : Update a pet owner&#39;s details
     * Updates the pet owner record with the specified details.
     *
     * @param ownerId The ID of the pet owner. (required)
     * @param ownerFieldsDto The pet owner details to use for the update. (required)
     * @return Update successful. (status code 200)
     *         or Bad request. (status code 400)
     *         or Owner not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "updateOwner",
        summary = "Update a pet owner's details",
        description = "Updates the pet owner record with the specified details.",
        tags = { "owner" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Update successful.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OwnerDto.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Owner not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/owners/{ownerId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<OwnerDto> updateOwner(
        @Min(0) @Parameter(name = "ownerId", description = "The ID of the pet owner.", required = true, in = ParameterIn.PATH) @PathVariable("ownerId") Integer ownerId,
        @Parameter(name = "OwnerFieldsDto", description = "The pet owner details to use for the update.", required = true) @Valid @RequestBody OwnerFieldsDto ownerFieldsDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /owners/{ownerId}/pets/{petId} : Update a pet&#39;s details
     * Updates the pet record with the specified details.
     *
     * @param ownerId The ID of the pet owner. (required)
     * @param petId The ID of the pet. (required)
     * @param petFieldsDto The pet details to use for the update. (required)
     * @return Update successful. (status code 204)
     *         or Bad request. (status code 400)
     *         or Pet not found for this owner. (status code 404)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "updateOwnersPet",
        summary = "Update a pet's details",
        description = "Updates the pet record with the specified details.",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Update successful."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Pet not found for this owner.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/owners/{ownerId}/pets/{petId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> updateOwnersPet(
        @Min(0) @Parameter(name = "ownerId", description = "The ID of the pet owner.", required = true, in = ParameterIn.PATH) @PathVariable("ownerId") Integer ownerId,
        @Min(0) @Parameter(name = "petId", description = "The ID of the pet.", required = true, in = ParameterIn.PATH) @PathVariable("petId") Integer petId,
        @Parameter(name = "PetFieldsDto", description = "The pet details to use for the update.", required = true) @Valid @RequestBody PetFieldsDto petFieldsDto
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
