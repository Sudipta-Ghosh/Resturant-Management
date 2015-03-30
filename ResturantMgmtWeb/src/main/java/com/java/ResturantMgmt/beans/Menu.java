package com.java.ResturantMgmt.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Menu {

   private final int OPT1 = 1;
   private final int OPT2 = 2;
   private int selectedOption;

   public Menu() {
	   selectedOption = OPT1;
   }

   public int getSelectedOption() {
      return selectedOption;
   }

   public void setSelectedOption(int selectedOption) {
      this.selectedOption = selectedOption;
   }

   public int getOPT1() {
      return OPT1;
   }

   public int getOPT2() {
      return OPT2;
   }
}