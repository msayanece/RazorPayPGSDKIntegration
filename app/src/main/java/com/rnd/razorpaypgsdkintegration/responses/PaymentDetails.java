package com.rnd.razorpaypgsdkintegration.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaymentDetails {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("entity")
    @Expose
    private String entity;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("order_id")
    @Expose
    private String orderId;
    @SerializedName("invoice_id")
    @Expose
    private String invoiceId;
    @SerializedName("international")
    @Expose
    private String international;
    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("amount_refunded")
    @Expose
    private String amountRefunded;
    @SerializedName("refund_status")
    @Expose
    private String refundStatus;
    @SerializedName("captured")
    @Expose
    private String captured;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("card_id")
    @Expose
    private String cardId;
    @SerializedName("bank")
    @Expose
    private String bank;
    @SerializedName("wallet")
    @Expose
    private String wallet;
    @SerializedName("vpa")
    @Expose
    private String vpa;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("contact")
    @Expose
    private String contact;
    @SerializedName("notes")
    @Expose
    private Notes notes;
    @SerializedName("fee")
    @Expose
    private String fee;
    @SerializedName("tax")
    @Expose
    private String tax;
    @SerializedName("error_code")
    @Expose
    private String errorCode;
    @SerializedName("error_description")
    @Expose
    private String errorDescription;
    @SerializedName("created_at")
    @Expose
    private Integer createdAt;

    /**
     * No args constructor for use in serialization
     *
     */
    public PaymentDetails() {
    }

    /**
     *
     * @param entity
     * @param captured
     * @param contact
     * @param wallet
     * @param currency
     * @param amount
     * @param id
     * @param refundStatus
     * @param createdAt
     * @param description
     * @param amountRefunded
     * @param bank
     * @param orderId
     * @param cardId
     * @param invoiceId
     * @param status
     * @param vpa
     * @param international
     * @param errorDescription
     * @param fee
     * @param tax
     * @param email
     * @param errorCode
     * @param method
     * @param notes
     */
    public PaymentDetails(String id, String entity, Integer amount, String currency, String status, String orderId, String invoiceId, String international, String method, String amountRefunded, String refundStatus, String captured, String description, String cardId, String bank, String wallet, String vpa, String email, String contact, Notes notes, String fee, String tax, String errorCode, String errorDescription, Integer createdAt) {
        super();
        this.id = id;
        this.entity = entity;
        this.amount = amount;
        this.currency = currency;
        this.status = status;
        this.orderId = orderId;
        this.invoiceId = invoiceId;
        this.international = international;
        this.method = method;
        this.amountRefunded = amountRefunded;
        this.refundStatus = refundStatus;
        this.captured = captured;
        this.description = description;
        this.cardId = cardId;
        this.bank = bank;
        this.wallet = wallet;
        this.vpa = vpa;
        this.email = email;
        this.contact = contact;
        this.notes = notes;
        this.fee = fee;
        this.tax = tax;
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInternational() {
        return international;
    }

    public void setInternational(String international) {
        this.international = international;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getAmountRefunded() {
        return amountRefunded;
    }

    public void setAmountRefunded(String amountRefunded) {
        this.amountRefunded = amountRefunded;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getCaptured() {
        return captured;
    }

    public void setCaptured(String captured) {
        this.captured = captured;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    public String getVpa() {
        return vpa;
    }

    public void setVpa(String vpa) {
        this.vpa = vpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

}
