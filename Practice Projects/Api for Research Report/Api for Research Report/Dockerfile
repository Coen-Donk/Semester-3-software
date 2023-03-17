#See https://aka.ms/containerfastmode to understand how Visual Studio uses this Dockerfile to build your images for faster debugging.

#Depending on the operating system of the host machines(s) that will build or run the containers, the image specified in the FROM statement may need to be changed.
#For more information, please see https://aka.ms/containercompat

FROM mcr.microsoft.com/dotnet/aspnet:6.0 AS base
WORKDIR /app
EXPOSE 80
EXPOSE 443

FROM mcr.microsoft.com/dotnet/sdk:6.0 AS build
WORKDIR /src
COPY ["Api for Research Report/Api for Research Report.csproj", "Api for Research Report/"]
RUN dotnet restore "Api for Research Report/Api for Research Report.csproj"
COPY . .
WORKDIR "/src/Api for Research Report"
RUN dotnet build "Api for Research Report.csproj" -c Release -o /app/build

FROM build AS publish
RUN dotnet publish "Api for Research Report.csproj" -c Release -o /app/publish /p:UseAppHost=false

FROM base AS final
WORKDIR /app
COPY --from=publish /app/publish .
ENTRYPOINT ["dotnet", "Api for Research Report.dll"]