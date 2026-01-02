# Navegação entre telas com Jetpack Compose
Exemplo didático de navegação no Jetpack Compose utilizando `object`
para representar telas sem argumentos.


## Conceitos abordados
- Stack de navegação
- Empilhamento de telas (navigate)
- Desempilhamento de telas (popBackStack)
- Uso de `object` como rota


## Empilhamento de telas (Stack)

```mermaid
graph TB
    Tela1[Tela 1 - base]
    Tela2[Tela 2]
    Tela3[Tela 3 - topo]

    Tela1 --> Tela2
    Tela2 --> Tela3


    
- Cada `navigate()` empilha uma nova tela
- A última tela é sempre o topo (visível)

---

```md
## Desempilhamento de telas (popBackStack)

```mermaid
graph TB
    Tela3[Tela 3]
    Tela2[Tela 2]
    Tela1[Tela 1]

    Tela3 --> Tela2
    Tela2 --> Tela1

