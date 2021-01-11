package com.xabia.vaccnow.model;

public class Vaccines {

    private int vaccine_id;
    private String name;

    public Vaccines() {
    }

    public Vaccines(int vaccine_id, String name) {
        this.vaccine_id = vaccine_id;
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public int getVaccine_id() {
		return vaccine_id;
	}

	public void setVaccine_id(int vaccine_id) {
		this.vaccine_id = vaccine_id;
	}


}
