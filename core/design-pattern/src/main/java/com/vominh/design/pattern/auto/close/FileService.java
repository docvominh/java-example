package com.vominh.design.pattern.auto.close;

public class FileService implements AutoCloseable {

    public void showError() {
        int x = 1 / 0;
    }

    @Override
    public void close() throws Exception {
        System.out.println(this.getClass() + " closed");
    }


    public static void main(String[] args) {
        try (FileService service = new FileService()) {
            service.showError();
        } catch (Exception e) {
            System.err.println("Error happened");
        }
    }
}
