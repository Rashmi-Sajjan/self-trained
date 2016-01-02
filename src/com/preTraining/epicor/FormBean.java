package com.preTraining.epicor;

public class FormBean
{
	String  name;
	String email;
	String gender;
	String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() 
	{
		return "FormBean:Name= "+name+"Email= "+email+"Gender= "+gender+"City= "+city;
	}
	@Override
	public int hashCode()
	{
		// TODO Auto-generated method stub
		return (name+email+gender+city).hashCode();
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof FormBean)
		{
			FormBean fb=(FormBean)obj;
			if(this.name.equals(fb.name) && this.email.equals(fb.email) && this.gender.equals(fb.gender) && this.city.equals(fb.city))
				return true;
			else
				return false;
		}
		else
			return false;
	}

}
