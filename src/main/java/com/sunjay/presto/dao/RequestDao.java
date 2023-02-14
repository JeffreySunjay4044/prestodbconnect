package com.sunjay.presto.dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestDao {
    @JsonProperty("start_time")
    String startTime;

    @JsonProperty("end_time")
    String endTime;
    @JsonProperty("partition_by_fccr_fg")
    String partitionByFccrFg;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPartitionByFccrFg() {
        return partitionByFccrFg;
    }

    public void setPartitionByFccrFg(String partitionByFccrFg) {
        this.partitionByFccrFg = partitionByFccrFg;
    }

    public String getPartitionByFccrPerimeter() {
        return partitionByFccrPerimeter;
    }

    public void setPartitionByFccrPerimeter(String partitionByFccrPerimeter) {
        this.partitionByFccrPerimeter = partitionByFccrPerimeter;
    }

    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns;
    }

    public String getFcrPerimeter() {
        return fcrPerimeter;
    }

    public void setFcrPerimeter(String fcrPerimeter) {
        this.fcrPerimeter = fcrPerimeter;
    }

    public String getCustomerLocalIdentifier() {
        return customerLocalIdentifier;
    }

    public void setCustomerLocalIdentifier(String customerLocalIdentifier) {
        this.customerLocalIdentifier = customerLocalIdentifier;
    }

    public String getCustomerRctIdentifier() {
        return customerRctIdentifier;
    }

    public void setCustomerRctIdentifier(String customerRctIdentifier) {
        this.customerRctIdentifier = customerRctIdentifier;
    }

    public String getCustomerLegalHome() {
        return customerLegalHome;
    }

    public void setCustomerLegalHome(String customerLegalHome) {
        this.customerLegalHome = customerLegalHome;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerLocalRegistrationId() {
        return customerLocalRegistrationId;
    }

    public void setCustomerLocalRegistrationId(String customerLocalRegistrationId) {
        this.customerLocalRegistrationId = customerLocalRegistrationId;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getFreeCriteria1() {
        return freeCriteria1;
    }

    public void setFreeCriteria1(String freeCriteria1) {
        this.freeCriteria1 = freeCriteria1;
    }

    public String getfreeCriteria2() {
        return freeCriteria2;
    }

    public void setfreeCriteria2(String freeCriteria2) {
        this.freeCriteria2 = freeCriteria2;
    }

    public String getFreeCriteria3() {
        return this.freeCriteria3 ;
    }

    public void setFreeCreteria3(String freeCriteria3) {
        this.freeCriteria3 = freeCriteria3;
    }

    public String getChangeIndicatorOnFinalRating() {
        return changeIndicatorOnFinalRating;
    }

    public void setChangeIndicatorOnFinalRating(String changeIndicatorOnFinalRating) {
        this.changeIndicatorOnFinalRating = changeIndicatorOnFinalRating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRatingStatus() {
        return ratingStatus;
    }

    public void setRatingStatus(String ratingStatus) {
        this.ratingStatus = ratingStatus;
    }

    public String getFinalRating() {
        return finalRating;
    }

    public void setFinalRating(String finalRating) {
        this.finalRating = finalRating;
    }

    public RequestDao(String startTime, String endTime, String partitionByFccrFg, String partitionByFccrPerimeter, String columns, String fcrPerimeter, String customerLocalIdentifier, String customerRctIdentifier, String customerLegalHome, String customerFirstName, String customerLastName, String customerLocalRegistrationId, String customerStatus, String version, String segment, String freeCriteria1, String freeCriteria2, String getFreeCreteria3, String changeIndicatorOnFinalRating, String type, String ratingStatus, String finalRating) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.partitionByFccrFg = partitionByFccrFg;
        this.partitionByFccrPerimeter = partitionByFccrPerimeter;
        this.columns = columns;
        this.fcrPerimeter = fcrPerimeter;
        this.customerLocalIdentifier = customerLocalIdentifier;
        this.customerRctIdentifier = customerRctIdentifier;
        this.customerLegalHome = customerLegalHome;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerLocalRegistrationId = customerLocalRegistrationId;
        this.customerStatus = customerStatus;
        this.version = version;
        this.segment = segment;
        this.freeCriteria1 = freeCriteria1;
        this.freeCriteria2 = freeCriteria2;
        this.freeCriteria3 = freeCriteria3;
        this.changeIndicatorOnFinalRating = changeIndicatorOnFinalRating;
        this.type = type;
        this.ratingStatus = ratingStatus;
        this.finalRating = finalRating;
    }

    @JsonProperty("partition_by_fccr_perimeter")
    String partitionByFccrPerimeter;

    @JsonProperty("columns")
    String columns;
    @JsonProperty("fcr_erimeter")
    String fcrPerimeter;

    @JsonProperty("customer_local_identifier")
    String customerLocalIdentifier;
    @JsonProperty("customer_rct_identifier")
    String customerRctIdentifier;

    @JsonProperty("customer_legal_name")
    String customerLegalHome;

    @JsonProperty("customer_first_name")
    String customerFirstName;

    @JsonProperty("customer_last_name")
    String customerLastName;
    @JsonProperty("customer_local_registration_id")
    String customerLocalRegistrationId;
    @JsonProperty("customer_status")
    String customerStatus;

    @JsonProperty("version")
    String version;
    @JsonProperty("segment")
    String segment;

    @JsonProperty("free_criteria1")
    String freeCriteria1;
    @JsonProperty("free_criteria2")
    String freeCriteria2;

    @JsonProperty("free_criteria3")
    String freeCriteria3;
    @JsonProperty("change_indicator_on_final_rating")
    String changeIndicatorOnFinalRating;
    @JsonProperty("type")
    String type;
    @JsonProperty("rating_status")
    String ratingStatus;
    @JsonProperty("final_rating")
    String finalRating;
}
