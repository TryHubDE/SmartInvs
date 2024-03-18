![SmartInvs Logo](http://minuskube.fr/img/smart-invs/smart_invs.png)

[![License](https://img.shields.io/github/license/minuskube/smartinvs.svg?style=flat-square)](https://github.com/MinusKube/SmartInvs/blob/master/LICENSE.md)

# SmartInvs
Advanced Inventory API for your Minecraft Bukkit plugins.

*Tested Minecraft versions: 1.19, 1.20*  
**You can use this as a Plugin, or use it as a library** (see [the docs](https://minuskube.gitbook.io/smartinvs/))

## Features
* Inventories of any type (workbench, chest, furnace, ...)
* Customizable size when possible (chest, ...)
* Custom titles
* Allows to prevent the player from closing its inventory
* Custom listeners for the event related to the inventory
* Iterator for inventory slots
* Page system
* Util methods to fill an inventory's row/column/borders/...
* Actions when player clicks on an item
* Update methods to edit the content of the inventory every tick
* Adventure component support

## Docs
[Click here to read the docs on Gitbook](https://minuskube.gitbook.io/smartinvs/)

## Usage
To use the SmartInvs API, either:
- Put it in the `plugins` folder of your server, add it to your dependencies in your plugin.yml (e.g. `depend: [SmartInvs]`) and add it to the dependencies in your IDE.
- Put it inside your plugin jar, initialize an `InventoryManager` in your plugin (don't forget to call the `init()` method), and add a `.manager(invManager)` to your SmartInventory Builders.

## Using SmartInvs in your plugin

### Maven
```xml
<repositories>
  <repository>
     <id>github</id>
     <url>https://maven.pkg.github.com/avionik-world/SmartInvs</url>
   </repository>
</repositories>
```

```xml
<dependencies>
 <dependency>
    <groupId>world.avionik</groupId>
    <artifactId>smart-invs</artifactId>
    <version>1.3.1</version>
    <scope>provided</scope>
  </dependency>
</dependencies>
```

### Gradle
```groovy
repositories {
    maven { url = 'https://maven.pkg.github.com/avionik-world/SmartInvs' }
}
```

```groovy
dependencies {
    compileOnly 'world.avionik:smart-invs:1.3.1'
}
