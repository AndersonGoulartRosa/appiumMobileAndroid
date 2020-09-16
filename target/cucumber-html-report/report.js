$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/cucumber/FormularioTeste.feature");
formatter.feature({
  "line": 1,
  "name": "Valido Formulário",
  "description": "",
  "id": "valido-formulário",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valido capmo 1",
  "description": "",
  "id": "valido-formulário;valido-capmo-1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "inicio o formulario",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "faco o paranue",
  "keyword": "When "
});
formatter.match({
  "location": "FormularioTeste.inicio_o_formulario()"
});
formatter.result({
  "duration": 101034800,
  "status": "passed"
});
formatter.match({
  "location": "FormularioTeste.faco_o_paranue()"
});
formatter.result({
  "duration": 68200,
  "status": "passed"
});
});