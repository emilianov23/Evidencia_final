package com.example.emiliano.evidencia_final;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

public class Curp implements Parcelable {
    private String nombre;
    private String Apellidopater;
    private String Apellidomater;
    private String Estado;
    private int diacumple;
    private int mescumple;
    private int añocumple;
    private String Sexo;

public Curp(){
    this.nombre="";
    this.Apellidopater="";
    this.Apellidomater="";
    this.Estado="";
    this.diacumple=1;
    this.mescumple=1;
    this.añocumple=1800;
    this.Sexo="";
}

    public Curp(String nombre, String Apellidopater, String Apellidomater, String Estado, int diacumple, int mescumple, int añocumple, String Sexo){
        this.nombre = nombre;
        this.Apellidopater = Apellidopater;
        this.Apellidomater = Apellidomater;
        this.Estado = Estado;
        this.diacumple = diacumple;
        this.mescumple = mescumple;
        this.añocumple = añocumple;
        this.Sexo = Sexo;
    }

    public String getName() {
        return nombre;
    }

    public GregorianCalendar getcumple() {
        return new GregorianCalendar(diacumple, mescumple, añocumple);
    }

    public String getApellidopater() {
        return Apellidopater;
    }

    public String getApellidomater() {
        return Apellidomater;
    }

    public String getEstado() {
        return Estado;
    }

    public String getSexo() {
        return Sexo;
    }
    public int getDiacumple() {
        return diacumple;
    }

    public int getMescumple() {
        return mescumple;
    }

    public int getAñocumple() {
        return añocumple;
    }

    public void getName(String name) {
        this.nombre = name;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(Apellidopater);
        parcel.writeString(Apellidomater);
        parcel.writeString(Estado);
        parcel.writeInt(diacumple);
        parcel.writeInt(mescumple);
        parcel.writeInt(añocumple);
        parcel.writeString(Sexo);
    }
    public String getcurp(){
        String c = "";
        c += (this.nombre.toUpperCase().toCharArray())[0];
        c += (this.Apellidopater.toUpperCase().toCharArray())[1];
        c += (this.Apellidomater.toUpperCase().toCharArray())[0];
        c += String.format("%1$02d%2$02d%3$02d", this.diacumple, this.mescumple, this.añocumple);

        return c;
    }
    private class Database {
        private Context context;

        public Database(Context c){
            this.context = c;
        }

        public Context getContext() {
            return context;
        }
    }

    private static class BaseSelect {
        private Context context;
        private String selec;
        private String selecArgs;
        private String Orden;

        public final String ASC = Curp_data.Columna_Nombre +  " ASC";
        public final String DESC = Curp_data.Columna_Nombre+ " DESC";

        public BaseSelect (Context contex)
            this.Context = context;
        this.selec="";
        this.selecArgs=a;
        this.orden=this.Asc;
    }

    public BaseSelect(Context context, String selec, String selecnArgs){
        this.Context = context;
        this.selec = selec;
        this.selenArgs = selecnArgs;
        this.Orden = this.ASC;
    }

    public Context getcontext() {
        return context;
    }

    public String getSelec() {
        return selec;
    }

    public String[] getSelecArgs() {
        return selecArgs;
    }

    public String getOrden() {
        return Orden;
    }

}
