CLASS zcl_gol_15 DEFINITION
  PUBLIC
  FINAL
  CREATE PUBLIC .

  PUBLIC SECTION.
    Types: ty_zeile type table of abap_bool with DEFAULT KEY,
           ty_feld type STANDARD TABLE OF ty_zeile with DEFAULT KEY.
           methods: constructor
            importing feld type ty_feld,
            step,
            get_zustand exporting zustand type ty_feld.
  PROTECTED SECTION.
  PRIVATE SECTION.
    DATA: mv_feld TYPE ty_feld.
          METHODS: transform
            importing zeile type i
                      spalte type i
                      returning value(wert) type abap_bool.
ENDCLASS.



CLASS zcl_gol_15 IMPLEMENTATION.

  METHOD constructor.
   mv_feld = feld.
  ENDMETHOD.

  METHOD get_zustand.
     zustand = mv_feld.
  ENDMETHOD.

  METHOD step.
    data: neu type ty_feld,
          zeile type i,
          spalte type i.

     Loop at mv_feld ASSIGNING FIELD-SYMBOL(<zeile>).
        zeile = sy-tabix.
        loop at <zeile> ASSIGNING FIELD-SYMBOL(<zelle>).
            spalte = sy-tabix.
            neu[ zeile ][ spalte ] = transform( zeile = zeile spalte = spalte ) .
        endloop.
     endloop.
  ENDMETHOD.

  METHOD transform.
    wert = abap_false.
  ENDMETHOD.
ENDCLASS.
