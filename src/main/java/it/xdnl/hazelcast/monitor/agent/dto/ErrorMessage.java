package it.xdnl.hazelcast.monitor.agent.dto;

import java.util.ArrayList;
import java.util.List;

public class ErrorMessage extends Message {
    public static final String MESSAGE_TYPE = "error";
    private List<String> errors = new ArrayList<>();

    public ErrorMessage() {
        super(MESSAGE_TYPE);
    }

    public ErrorMessage(final String ...errors) {
        super(MESSAGE_TYPE);
        for (String error : errors) {
            this.errors.add(error);
        }
    }

    public ErrorMessage(final Iterable<String> errors) {
        super(MESSAGE_TYPE);
        for (String error : errors) {
            this.errors.add(error);
        }
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
