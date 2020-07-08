# Fabric Essentials Mod

## Modules

#### API

Essentials-api is the module used for developing your own modules against.

#### Base

Essentials-base is the core implementation of essentials. This is needed for most modules to work.

#### Chat

Chat module. Provides nicknames and chat colors.

##### Commands

 - /nickname [nickname]
    - Sets your current nickname or clears it. Supports color codes.

#### Currency

Module providing the currency handling in essentials as well as some basic commands

##### Commands

 - /balance [player]
    - Show your current account balance, or from a specified player
 - /pay \<user> \<amount>
    - Send money from your account to someone else

#### Datapacks

Essentials-datapacks is a module that aims to port various utility datapacks for better performance.
Permission has been granted for this by the respective authors, either through explicit permission or following the terms.

Included:
- [Vanilla Tweaks by Xisumavoid](https://www.xisumavoid.com/vanillatweaks)
  - Anti Creeper Grief
  - Anti Enderman Grief
  - Anti Ghast Grief
  - Silence Mobs
  - Player Head Drops
  - More Mob Heads
  
- [Datapacks by VoodooBeard](http://mc.voodoobeard.com/)
  - Shulkermites
  - Auto-Plant Saplings
  - Server Friendly Wither
  - Anti Zombie Breach
  - Apiarist Suit
  - Invisible Item Frames
  

#### Dynmap

Implementation of Dynmap for Essentials. WIP and unreleased.

#### Market

Public Market module

##### Commands

 - /market
    - Opens the market GUI
 - /market add \<price> [amount]
    - Adds the current item the player is holding to the market

#### Teleport

TODO

#### Utilities

Includes a bunch of commands and miscellaneous features that don't belong to any specific module.

##### Commands
 - /flight 
    - Allows toggling a player's ability to fly.
 - /god 
    - Makes a player invulnerable
 - /hat 
    - Allows a player to place the item in their hand on their head
 - /head 
    - Gives a player another player's head
 - /heal 
    - Heals a player
 - /speed 
    - Allows a player's walking and flying speed to be changed
 - /tps 
    - Prints the server's current tick rate in ticks per second

## License
This mod is available under the [MIT license](LICENSE).

## Contributing
More information will be provided soon. Contributions should follow the guidelines in [CONTRIBUTING.md](CONTRIBUTING.md).
