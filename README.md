# fiap-checkpoint2

# Instruções Docker - Perfis
## Executando imagem
```
docker run -p 8080:8080 fiap-checkpoint2
```

## Como executar no modo DEV
```
docker run -p 8080:8080 -e PROFILE=dev fiap-checkpoint2
ou
docker run -p 8080:8080 fiap-checkpoint2
```

## Como executar no modo stg
```
docker run -p 8080:8080 -e PROFILE=stg fiap-checkpoint2
```

## Como executar no modo prd
```
docker run -p 8080:8080 -e PROFILE=prd fiap-checkpoint2
```

# Integrantes

| Integrante | Github |
| --- | --- |
| Luiz Macilia | https://github.com/luizmacilia/fiap-checkpoint2 |
| Pedro Lamark | https://github.com/PedroLamark/fiap-checkpoint2 |
