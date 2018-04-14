CLASS zcl_gol_15 DEFINITION
  PUBLIC
  FINAL
  CREATE PUBLIC .

  PUBLIC SECTION.
    METHODS: constructor IMPORTING iv_neighbours_alive TYPE i
                                   iv_is_dead          TYPE abap_bool,
      neuer_status RETURNING VALUE(rv_will_i_live) TYPE abap_bool.
  PROTECTED SECTION.
  PRIVATE SECTION.
    DATA: mv_neighbours_alive TYPE i.
    DATA: mv_is_dead TYPE abap_bool.

ENDCLASS.



CLASS ZCL_GOL_15 IMPLEMENTATION.


  METHOD constructor.
    mv_neighbours_alive = iv_neighbours_alive.
    mv_is_dead  = iv_is_dead.
  ENDMETHOD.


  METHOD neuer_status.


    IF ( mv_is_dead = abap_true ).
    if ( mv_neighbours_alive = 3 ).
      rv_will_i_live = abap_true.
    endif.

    ELSE.
      rv_will_i_live = COND #(
  WHEN ( ( mv_neighbours_alive < 2 ) OR ( mv_neighbours_alive > 3 ) )
  THEN abap_false ELSE abap_true ).

    ENDIF.

  ENDMETHOD.
ENDCLASS.
