# Library

The library is build as a bounded context, modelling a fictional domain. Its purpose is to represent book loans.

## Business Rules

Domain experts communicate in Spanish, so it is in this language that they define their terms.

### Domain Entities and Aggregates

// TODO

### Glossary

| Término  | Term (en) | Definición                                                                                                     | Ejemplo de uso                                                                                          |
|----------|-----------|----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------|
| Préstamo | Loan      | Retirar Libro de la biblioteca durante un tiempo. Lo lleva a cabo un usuario                                   | Juan tiene un préstamos de "Cien años de soledad"                                                       |
| Usuario  | User      | Persona usuaria del sistema de préstamos de la biblioteca. Se le pueden prestar libros                         | Juan tiene un préstamo activo                                                                           |
| Libro    | Book      | Ejemplar físico de un libro que puede ser prestado                                                             | Tenemos disponibles los libros "El diario de Ana Frank" y "Frankenstein"                                |
| Sanción  | Penalty   | Penalización que ocurre cuando un usuario no devuelve un libro prestado antes de la fecha máxima de devolución | Juan entregó el Libro prestado un día antes de la fecha máxima de devolución. Por ello no tiene sanción |
