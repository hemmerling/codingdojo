*"* use this source file for your ABAP unit test classes
CLASS ltcl_zellentest DEFINITION FINAL FOR TESTING
  DURATION SHORT
  RISK LEVEL HARMLESS.

  PRIVATE SECTION.
    METHODS:
      zelle_1_nb_stirbt FOR TESTING RAISING cx_static_check,
      zelle_2_nb_ueberlebt FOR TESTING RAISING cx_static_check,
      zelle_4_nb_stirbt FOR TESTING RAISING cx_static_check,
      zelle_3_nb_wird_geboren FOR TESTING RAISING cx_static_check.
ENDCLASS.


CLASS ltcl_zellentest IMPLEMENTATION.

  METHOD zelle_1_nb_stirbt.
    cl_abap_unit_assert=>assert_equals(
       msg = 'Zelle mit 1 Nachbarn stirbt'
       exp = abap_false
       act = NEW zcl_gol_15( iv_is_dead = abap_false iv_neighbours_alive = 1 )->neuer_status( ) ).
  ENDMETHOD.

  METHOD zelle_2_nb_ueberlebt.
    cl_abap_unit_assert=>assert_equals(
       msg = 'Zelle mit 2 Nachbarn ueberlebt'
       exp = abap_true
       act = NEW zcl_gol_15( iv_is_dead = abap_false iv_neighbours_alive = 2 )->neuer_status( ) ).
  ENDMETHOD.

  METHOD zelle_4_nb_stirbt.
    cl_abap_unit_assert=>assert_equals(
       msg = 'Zelle mit 4 Nachbarn stirbt'
       exp = abap_false
       act = NEW zcl_gol_15( iv_is_dead = abap_false iv_neighbours_alive = 4 )->neuer_status( ) ).
  ENDMETHOD.

  METHOD zelle_3_nb_wird_geboren.
    cl_abap_unit_assert=>assert_equals(
       msg = 'Zelle mit 3 Nachbarn wird geboren'
       exp = abap_true
       act = NEW zcl_gol_15(  iv_is_dead = abap_true iv_neighbours_alive = 3 )->neuer_status( ) ).
  ENDMETHOD.

ENDCLASS.
