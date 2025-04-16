#!/bin/bash

echo "🔄 Carregando variáveis de ambiente do arquivo Application/application-prd..."
export $(grep -v '^#' Application/application-prd | xargs)

echo "🚀 Iniciando aplicação com perfil 'prd'..."
mvn spring-boot:run -Dspring-boot.run.profiles=prd
