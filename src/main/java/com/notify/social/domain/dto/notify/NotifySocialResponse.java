package com.notify.social.domain.dto.notify;

public record NotifySocialResponse(
        String status,
        String message
) {

    public static NotifySocialResponse success(String message) {
        return new NotifySocialResponse("success", message);
    }

    public static NotifySocialResponse failure(String message) {
        return new NotifySocialResponse("failure", message);
    }
}