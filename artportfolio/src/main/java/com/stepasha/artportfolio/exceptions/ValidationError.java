package com.stepasha.artportfolio.exceptions;
// TODO 4 error validator
public class ValidationError
{
    private String Code;
    private String message;

    public String getCode()
    {
        return Code;
    }

    public void setCode(String code)
    {
        Code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return "ValidationError{" + "Code='" + Code + '\'' + ", message='" + message + '\'' + '}';
    }
}