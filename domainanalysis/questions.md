# Questions from the book

## Q1: Purpose

*What is the purpose of the language?*

A language for music enthusiasts to define, organize and navigate collections of music.

*What are the use cases?*

- I want to have a collection of all my music media independent of their physical location. (Collection)
- I want to express my own organization of music - not just Artist/Album (Preferences + Collection)
- Playlists
  - I want to make "normal" playlists of songs in order
  - I want to make "advanced" playlists based on queries
  - I want to customize how a playlist is played (e.g. play entire albums, artist, random songs, sleep timer, loop)
- I want to present my collection to other people (e.g. to share a list of favorite albums) (model to text)
- I want to import and export collections to JSON or XML (model test)
- I want to insure my record collection

## Q2: StakeHolders

*Who are the key stakeholders and the intended users of the language?*

Prioritized list:

1. ⭐️Music collectors (enthusiasts, DJ's)
2. Music producers / songWriters
3. Physical media traders (discogs users)
4. Archivists or researchers

## Q3: Concepts

*What are the key domain concepts that users care about?*

- PlayList (simple, advanced)
- Source - location
- Recommendation
- Collection
- Queue
- Object
  - Album
  - Song / Composition
- Location / source
- Queries
- Configurations
  - Sleep timer
  - Looping
  - Randomizations
- Categorization / properties
  - Genre
  - Artist
  - Format (e.g. LP, CD, digital, mp3, streaming...)
  - User defined Folder*
  - Tag
  - Rating
- Notes
  - Lyrics
  - Attachment (like a booklet)
  - Log / journal
- Link
  - Reference
  - Sequence
  - Track

## Q4: Relations

*How are domain concepts related, and what are their relevant properties?*

**Compositions, Tracks**

There may be one or more Tracks of a Composition.

The Composition is an abstract representation.
A Composition with Tracks must have a default Track (first entry).
It can have properties that act as overridable default properties for Tracks.
Tracks are like a subclass of Composition and can be used in place of a Composition anywhere a Composition is references.

A Track can have none or multiple locations where a physical recording of it exists.*
The user can query for Track that are available to them at the given time.



**Source and locations**

A source is a named place where physical music media may be found.
A location is a combination of a source and a link to find a specific resource inside it.
Example:

Source MyLocalMusicFolder
Location MyLocalMusicfolder + URI to Composition.

**Album**

An album is 0 or more Compositions or Tracks.
With an album artist.

**Collection**

A collection has 0 or more objects.
Objects can exist in 0 or more collections.
A collection can be a subcollection of another collection.
A collection can have a name and an owner (the user)

**Playlist**

A simple playlist relates and orders many Compositions from one or more collections.

**The Queue**

The queue is a playlist, there is exactly one queue. The queue does not have playback configurations.
The queue is the result of applying a playback configuration to a playlist or a query.

**Queries**

Queries can consist of multiple categorizations and properties and draws objects from one or more collections or simple playlists.
A query can be saved, and appears alongside playlists.
Queries can search unavailable collections.

**Configuration**

A playlist or a query can have a playback configuration associated.
If so, settings set in this configuration overrides the default configuration.

There exists a default playback configuration.
A playback configuration is a set of playback preferences.

Resource

Playback preference examples:

a) I only want to play back Compositions with currently available locations.
b) I want to "play" Compositions with a specific location type (e.g. in my LP collection).
c) I want to skip unavailable Compositions
d) I want to pause at unavailable Compositions.
e) I want the playback unit to be entire albums (or sides) (e.g. shuffle will shuffle albums, but each album will be played in sequence)
f) I want to limit the number of units played or total time played.

- Example: combining b & d, I can get a list of vinyl to play.

**Preferences**

???

## Q5: Examples

*What examples of language instances are available or can be prototyped?*

Query example:

```ourquery
playlist myplaylist
Compositions in collection my-collection1
with length over 7 minutes and average bpm like 123
and category rock, country, indie 
add
albums in collection my-collection2
with year after 200
add
Compositions in playlist myplaylist
```

```ourquery
playlist: name,
from collection: my-collection,
with length: 7 minutes,
& average bpm like: 123,
& category: rock, country, indie
```
