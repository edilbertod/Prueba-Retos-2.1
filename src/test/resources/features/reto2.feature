#Autor: Edilberto Duncan
  #language: es

  @HistoriaDeUsuario
  Característica: Yo como usuario quiero entrar a la pagina de Banistmo
    acceder a la opcion Aprender es facil Legales FATCA CRS
    y desplegar el pdf de nombre PJ-Autocertificacion unificado-Fatca y CRS

  @Escenario1:
  Escenario: Generar el documento pdf PJ-Autocertificacion unificado-Fatca y CRS.pdf
  Dado ingreso a la pagina web de banistmo
  Cuando accedo a la sección aprender es facil, legales, fatca & crs
  Y generar el documento pdf
  Entonces Verifico que el documento generado sea el correcto
