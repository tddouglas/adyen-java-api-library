/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.legalentitymanagement.CapabilityProblem;
import com.adyen.model.legalentitymanagement.DocumentReference;
import com.adyen.model.legalentitymanagement.EntityReference;
import com.adyen.model.legalentitymanagement.Individual;
import com.adyen.model.legalentitymanagement.LegalEntityAssociation;
import com.adyen.model.legalentitymanagement.LegalEntityCapability;
import com.adyen.model.legalentitymanagement.Organization;
import com.adyen.model.legalentitymanagement.SoleProprietorship;
import com.adyen.model.legalentitymanagement.TransferInstrumentReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.legalentitymanagement.JSON;

/**
 * LegalEntity
 */

public class LegalEntity {
  public static final String SERIALIZED_NAME_CAPABILITIES = "capabilities";
  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  private Map<String, LegalEntityCapability> capabilities = null;

  public static final String SERIALIZED_NAME_DOCUMENT_DETAILS = "documentDetails";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_DETAILS)
  private List<DocumentReference> documentDetails = null;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<EntityReference> documents = null;

  public static final String SERIALIZED_NAME_ENTITY_ASSOCIATIONS = "entityAssociations";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASSOCIATIONS)
  private List<LegalEntityAssociation> entityAssociations = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INDIVIDUAL = "individual";
  @SerializedName(SERIALIZED_NAME_INDIVIDUAL)
  private Individual individual;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private Organization organization;

  public static final String SERIALIZED_NAME_PROBLEMS = "problems";
  @SerializedName(SERIALIZED_NAME_PROBLEMS)
  private List<CapabilityProblem> problems = null;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SOLE_PROPRIETORSHIP = "soleProprietorship";
  @SerializedName(SERIALIZED_NAME_SOLE_PROPRIETORSHIP)
  private SoleProprietorship soleProprietorship;

  public static final String SERIALIZED_NAME_TRANSFER_INSTRUMENTS = "transferInstruments";
  @SerializedName(SERIALIZED_NAME_TRANSFER_INSTRUMENTS)
  private List<TransferInstrumentReference> transferInstruments = null;

  /**
   * The type of legal entity.   Possible values: **individual**, **organization**, or **soleProprietorship**.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INDIVIDUAL("individual"),
    
    ORGANIZATION("organization"),
    
    SOLEPROPRIETORSHIP("soleProprietorship"),
    
    TRUST("trust"),
    
    UNINCORPORATEDPARTNERSHIP("unincorporatedPartnership");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public LegalEntity() { 
  }

  
  public LegalEntity(
     Map<String, LegalEntityCapability> capabilities, 
     String id, 
     List<TransferInstrumentReference> transferInstruments
  ) {
    this();
    this.capabilities = capabilities;
    this.id = id;
    this.transferInstruments = transferInstruments;
  }

   /**
   * Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.
   * @return capabilities
  **/
  @ApiModelProperty(value = "Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.")

  public Map<String, LegalEntityCapability> getCapabilities() {
    return capabilities;
  }




  public LegalEntity documentDetails(List<DocumentReference> documentDetails) {
    
    this.documentDetails = documentDetails;
    return this;
  }

  public LegalEntity addDocumentDetailsItem(DocumentReference documentDetailsItem) {
    if (this.documentDetails == null) {
      this.documentDetails = new ArrayList<>();
    }
    this.documentDetails.add(documentDetailsItem);
    return this;
  }

   /**
   * List of documents uploaded for the legal entity.
   * @return documentDetails
  **/
  @ApiModelProperty(value = "List of documents uploaded for the legal entity.")

  public List<DocumentReference> getDocumentDetails() {
    return documentDetails;
  }


  public void setDocumentDetails(List<DocumentReference> documentDetails) {
    this.documentDetails = documentDetails;
  }


  public LegalEntity documents(List<EntityReference> documents) {
    
    this.documents = documents;
    return this;
  }

  public LegalEntity addDocumentsItem(EntityReference documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * List of documents uploaded for the legal entity.
   * @return documents
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "List of documents uploaded for the legal entity.")

  public List<EntityReference> getDocuments() {
    return documents;
  }


  public void setDocuments(List<EntityReference> documents) {
    this.documents = documents;
  }


  public LegalEntity entityAssociations(List<LegalEntityAssociation> entityAssociations) {
    
    this.entityAssociations = entityAssociations;
    return this;
  }

  public LegalEntity addEntityAssociationsItem(LegalEntityAssociation entityAssociationsItem) {
    if (this.entityAssociations == null) {
      this.entityAssociations = new ArrayList<>();
    }
    this.entityAssociations.add(entityAssociationsItem);
    return this;
  }

   /**
   * List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories.
   * @return entityAssociations
  **/
  @ApiModelProperty(value = "List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories.")

  public List<LegalEntityAssociation> getEntityAssociations() {
    return entityAssociations;
  }


  public void setEntityAssociations(List<LegalEntityAssociation> entityAssociations) {
    this.entityAssociations = entityAssociations;
  }


   /**
   * The unique identifier of the legal entity.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the legal entity.")

  public String getId() {
    return id;
  }




  public LegalEntity individual(Individual individual) {
    
    this.individual = individual;
    return this;
  }

   /**
   * Get individual
   * @return individual
  **/
  @ApiModelProperty(value = "")

  public Individual getIndividual() {
    return individual;
  }


  public void setIndividual(Individual individual) {
    this.individual = individual;
  }


  public LegalEntity organization(Organization organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @ApiModelProperty(value = "")

  public Organization getOrganization() {
    return organization;
  }


  public void setOrganization(Organization organization) {
    this.organization = organization;
  }


  public LegalEntity problems(List<CapabilityProblem> problems) {
    
    this.problems = problems;
    return this;
  }

  public LegalEntity addProblemsItem(CapabilityProblem problemsItem) {
    if (this.problems == null) {
      this.problems = new ArrayList<>();
    }
    this.problems.add(problemsItem);
    return this;
  }

   /**
   * List of the verification errors from capabilities for the legal entity.
   * @return problems
  **/
  @ApiModelProperty(value = "List of the verification errors from capabilities for the legal entity.")

  public List<CapabilityProblem> getProblems() {
    return problems;
  }


  public void setProblems(List<CapabilityProblem> problems) {
    this.problems = problems;
  }


  public LegalEntity reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the legal entity, maximum 150 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the legal entity, maximum 150 characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public LegalEntity soleProprietorship(SoleProprietorship soleProprietorship) {
    
    this.soleProprietorship = soleProprietorship;
    return this;
  }

   /**
   * Get soleProprietorship
   * @return soleProprietorship
  **/
  @ApiModelProperty(value = "")

  public SoleProprietorship getSoleProprietorship() {
    return soleProprietorship;
  }


  public void setSoleProprietorship(SoleProprietorship soleProprietorship) {
    this.soleProprietorship = soleProprietorship;
  }


   /**
   * List of transfer instruments that the legal entity owns.
   * @return transferInstruments
  **/
  @ApiModelProperty(value = "List of transfer instruments that the legal entity owns.")

  public List<TransferInstrumentReference> getTransferInstruments() {
    return transferInstruments;
  }




  public LegalEntity type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of legal entity.   Possible values: **individual**, **organization**, or **soleProprietorship**.
   * @return type
  **/
  @ApiModelProperty(value = "The type of legal entity.   Possible values: **individual**, **organization**, or **soleProprietorship**.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalEntity legalEntity = (LegalEntity) o;
    return Objects.equals(this.capabilities, legalEntity.capabilities) &&
        Objects.equals(this.documentDetails, legalEntity.documentDetails) &&
        Objects.equals(this.documents, legalEntity.documents) &&
        Objects.equals(this.entityAssociations, legalEntity.entityAssociations) &&
        Objects.equals(this.id, legalEntity.id) &&
        Objects.equals(this.individual, legalEntity.individual) &&
        Objects.equals(this.organization, legalEntity.organization) &&
        Objects.equals(this.problems, legalEntity.problems) &&
        Objects.equals(this.reference, legalEntity.reference) &&
        Objects.equals(this.soleProprietorship, legalEntity.soleProprietorship) &&
        Objects.equals(this.transferInstruments, legalEntity.transferInstruments) &&
        Objects.equals(this.type, legalEntity.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, documentDetails, documents, entityAssociations, id, individual, organization, problems, reference, soleProprietorship, transferInstruments, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalEntity {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    documentDetails: ").append(toIndentedString(documentDetails)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    entityAssociations: ").append(toIndentedString(entityAssociations)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    individual: ").append(toIndentedString(individual)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    soleProprietorship: ").append(toIndentedString(soleProprietorship)).append("\n");
    sb.append("    transferInstruments: ").append(toIndentedString(transferInstruments)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("capabilities");
    openapiFields.add("documentDetails");
    openapiFields.add("documents");
    openapiFields.add("entityAssociations");
    openapiFields.add("id");
    openapiFields.add("individual");
    openapiFields.add("organization");
    openapiFields.add("problems");
    openapiFields.add("reference");
    openapiFields.add("soleProprietorship");
    openapiFields.add("transferInstruments");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LegalEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LegalEntity.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LegalEntity is not found in the empty JSON string", LegalEntity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LegalEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LegalEntity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LegalEntity.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArraydocumentDetails = jsonObj.getAsJsonArray("documentDetails");
      if (jsonArraydocumentDetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("documentDetails").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `documentDetails` to be an array in the JSON string but got `%s`", jsonObj.get("documentDetails").toString()));
        }

        // validate the optional field `documentDetails` (array)
        for (int i = 0; i < jsonArraydocumentDetails.size(); i++) {
          DocumentReference.validateJsonObject(jsonArraydocumentDetails.get(i).getAsJsonObject());
        }
      }
      JsonArray jsonArraydocuments = jsonObj.getAsJsonArray("documents");
      if (jsonArraydocuments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("documents").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `documents` to be an array in the JSON string but got `%s`", jsonObj.get("documents").toString()));
        }

        // validate the optional field `documents` (array)
        for (int i = 0; i < jsonArraydocuments.size(); i++) {
          EntityReference.validateJsonObject(jsonArraydocuments.get(i).getAsJsonObject());
        }
      }
      JsonArray jsonArrayentityAssociations = jsonObj.getAsJsonArray("entityAssociations");
      if (jsonArrayentityAssociations != null) {
        // ensure the json data is an array
        if (!jsonObj.get("entityAssociations").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `entityAssociations` to be an array in the JSON string but got `%s`", jsonObj.get("entityAssociations").toString()));
        }

        // validate the optional field `entityAssociations` (array)
        for (int i = 0; i < jsonArrayentityAssociations.size(); i++) {
          LegalEntityAssociation.validateJsonObject(jsonArrayentityAssociations.get(i).getAsJsonObject());
        }
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `individual`
      if (jsonObj.getAsJsonObject("individual") != null) {
        Individual.validateJsonObject(jsonObj.getAsJsonObject("individual"));
      }
      // validate the optional field `organization`
      if (jsonObj.getAsJsonObject("organization") != null) {
        Organization.validateJsonObject(jsonObj.getAsJsonObject("organization"));
      }
      JsonArray jsonArrayproblems = jsonObj.getAsJsonArray("problems");
      if (jsonArrayproblems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("problems").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `problems` to be an array in the JSON string but got `%s`", jsonObj.get("problems").toString()));
        }

        // validate the optional field `problems` (array)
        for (int i = 0; i < jsonArrayproblems.size(); i++) {
          CapabilityProblem.validateJsonObject(jsonArrayproblems.get(i).getAsJsonObject());
        }
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field `soleProprietorship`
      if (jsonObj.getAsJsonObject("soleProprietorship") != null) {
        SoleProprietorship.validateJsonObject(jsonObj.getAsJsonObject("soleProprietorship"));
      }
      JsonArray jsonArraytransferInstruments = jsonObj.getAsJsonArray("transferInstruments");
      if (jsonArraytransferInstruments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("transferInstruments").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `transferInstruments` to be an array in the JSON string but got `%s`", jsonObj.get("transferInstruments").toString()));
        }

        // validate the optional field `transferInstruments` (array)
        for (int i = 0; i < jsonArraytransferInstruments.size(); i++) {
          TransferInstrumentReference.validateJsonObject(jsonArraytransferInstruments.get(i).getAsJsonObject());
        }
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LegalEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LegalEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LegalEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LegalEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<LegalEntity>() {
           @Override
           public void write(JsonWriter out, LegalEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LegalEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LegalEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LegalEntity
  * @throws IOException if the JSON string is invalid with respect to LegalEntity
  */
  public static LegalEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LegalEntity.class);
  }

 /**
  * Convert an instance of LegalEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

