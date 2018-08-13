function variableName(name) {
 return (/^([a-zA-Z]|\_){1}([a-zA-Z]|\d|\_){0,100}$/.test(name))? true: false;
}

