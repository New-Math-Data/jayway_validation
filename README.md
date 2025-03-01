## Micronaut 4.3.6 Documentation

- [User Guide](https://docs.micronaut.io/4.3.6/guide/index.html)
- [API Reference](https://docs.micronaut.io/4.3.6/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/4.3.6/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

- [Micronaut Maven Plugin documentation](https://micronaut-projects.github.io/micronaut-maven-plugin/latest/)
## Feature micronaut-aot documentation

- [Micronaut AOT documentation](https://micronaut-projects.github.io/micronaut-aot/latest/guide/)


## Feature maven-enforcer-plugin documentation

- [https://maven.apache.org/enforcer/maven-enforcer-plugin/](https://maven.apache.org/enforcer/maven-enforcer-plugin/)


## Feature serialization-jackson documentation

- [Micronaut Serialization Jackson Core documentation](https://micronaut-projects.github.io/micronaut-serialization/latest/guide/)

## Commands
- Build new docker image and run it ```bash ./run-build-docker.sh```
- Run an existing imange ```bash ./run-docker.sh.sh```

## Use
POST http://localhost:8080/json
```json
{
    "json": "string",
    "filter": "string"
}
```
[more info about the filter](https://github.com/json-path/JsonPath)
