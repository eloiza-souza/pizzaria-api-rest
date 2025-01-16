# Pizzaria Spring Web JPA H2

```mermaid
classDiagram
class OrderModel {
    - Long Id
    - String description
    - Long customerId
    + OrderModel()
    + OrderModel(String description, Long customerId)
    + Long getId()
    + void setId(Long id)
    + String getDescription()
    + void setDescription(String description)
    + Long getCustomerId()
    + void setCustomerId(Long customerId)
}