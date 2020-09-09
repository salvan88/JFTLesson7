package gerzen777gmail.com.library.controller;

public class LibraryRequest {
    private int idRequest;
    private String messageRequest;

    public LibraryRequest(int idRequest, String messageRequest) {
        this.idRequest = idRequest;
        this.messageRequest = messageRequest;
    }

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public String getMessageRequest() {
        return messageRequest;
    }

    public void setMessageRequest(String messageRequest) {
        this.messageRequest = messageRequest;
    }

    @Override
    public String toString() {
        return "LibraryRequest{" +
                "idRequest=" + idRequest +
                ", messageRequest='" + messageRequest + '\'' +
                '}';
    }
}
