Feature:
  As a supplier to the Bancolombia group
  I want to access the general information of suppliers
  To download the manual of Treatment and Protection Policies of Personal Data of Suppliers

  @DownloadManual
  Scenario: Download the manual of Treatment and Protection Policies of Personal Data of Suppliers
    Given that the supplier wants to use the Bancolombia Group Page
    When He download the manual of Treatment and Protection Policies of Personal Data of Suppliers
    Then He should see the manual POLÍTICAS DE TRATAMIENTO