package com.vominh.design.pattern.builder;

public class PC {

    // Required
    private String cpu;
    private float ram;
    private int harDisk;

    // Optional
    private String vga;
    private boolean floppy;

    public static class Builder {
        private String cpu;
        private float ram;
        private int harDisk;
        private String vga;
        private boolean floppy;


        public Builder(String cpu, float ram, int harDisk) {
            this.cpu = cpu;
            this.ram = ram;
            this.harDisk = harDisk;
        }

        public Builder vga(String value) {
            vga = value;
            return this;
        }

        public Builder floppy(boolean value) {
            floppy = value;
            return this;
        }

        private PC build() {
            PC pc = new PC();
            pc.cpu = this.cpu;
            pc.ram = this.ram;
            pc.harDisk = this.harDisk;
            pc.vga = this.vga;
            pc.floppy = this.floppy;
            return pc;
        }
    }


    public static void main(String[] args) {
        PC myPc = new Builder("Intel", 4, 250)
                .vga("Giga")
                .build();

        System.out.println(myPc.vga);
    }

}

